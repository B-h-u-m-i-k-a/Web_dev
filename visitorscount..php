<?php
$fname = "Count.txt";
$count[1] = 1;
if(file_exists($fname))
{
$count = file_get_contents($fname);
$count = explode("=", $count);
$count[1] = $count[1]+1;         // $count[1] += 1;
}
$file = fopen($fname, "w+");
fwrite($file, "Count = ".$count[1]);
fclose($file);
print "Previous visitors are..</br>";
for ($x = 1; $x < $count[1]; $x++)
{
 echo " $x <br>";
}
print "You are visitor number = ".$count[1];

?>
