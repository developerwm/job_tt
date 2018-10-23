<?php

$dbhost = 'xxxxx';
$dbuser = 'xxxxx';
$dbpass = 'xxxx';
$dbname = 'xxx';

 $dblink = new mysqli($dbhost, $dbuser, $dbpass, $dbname);

  if ($dblink->connect_errno) {
     printf("Failed to connect to database");
     exit();
  }

 $result = $dblink->query("SELECT * FROM event");

 $dbdata = array();

  while ( $row = $result->fetch_assoc())  {
	$dbdata[]=$row;
  }

 echo json_encode($dbdata);
 
?>

