<?php
$response =  $_POST['payload'];

$servername = "xxxxx";
$username = "xxxxx";
$password = "xxxxx";
$dbname = "xxxxx";

header('Content-Type: application/json');
$input = file_get_contents('php://input'); 


$character = json_decode($input);
$name = $character->action;
$strBody = $character->comment->body;
$strAuthor = $character->issue->author_association;

$webhook = json_decode($input, true);   
 
$payload = $webhook->action;   

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

$sql = "INSERT INTO event (author, body)
VALUES ('$strAuthor','$strBody')";

if ($conn->query($sql) === TRUE) {
    echo "success";
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();

?>