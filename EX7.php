<?php
$name=$_POST["uname"];
$pnum=$_POST["phone"];
if(preg_match("/^([0-9]{3})-([0-9]{3})-([0-9]{4})$/", $pnum))
{
print "Phone number is valid <br/>";
print "User name is : $name <br/>";
print "Phone number is : $pnum <br/>";
}
else
print "Phone number is not valid!";
?>
