<?php
$data = $_GET['x'];
$data_decode = json_decode($data);
$name = $data_decode->name;
$phone=$data_decode->phone;
$email= $data_decode->email;
echo "<br/> <h4> Information Entered </h4>";
echo "------------------------------<br/>";
print "Name : ".$name."<br/>";
print "Phone : ".$phone."<br/>";
print "Email : ".$email."<br/>";
echo "------------------------------<br/>";
// Create connection
$link = mysqli_connect("localhost:3306", "root", "","test");
// Check connection
if (!$link)
 {
die("Connection failed: " . mysqli_connect_error());
}
mysqli_select_db($link, "test");
$query1 = "CREATE TABLE tb_text_book(uname varchar(15), phone varchar(30), email char(30))";
$result = mysqli_query($link,$query1);
if($result)
echo "(2) Query1 executed... <br/>";
else
echo "(2) Table not created : ".mysqli_error($link)."<br/>";
$query2 = "INSERT INTO tb_text_book VALUES('$name', '$phone', '$email')";
$res2 = mysqli_query($link,$query2);
if($res2)
echo "(3) Values inserted in the table ... <br/>";
else
echo "(3) Query2 not executed: ".mysqli_error($link)."<br/>";
$query3 = "SELECT * FROM tb_text_book";
$res3 = mysqli_query($link,$query3);
echo "<br/> <h3> Table Contents Are </h3>";
print " <b> name | phone | email </b> <br/>";
$no =0;
while($row = mysqli_fetch_array($res3))
{
print "-------------------------------<br/>";
$no += 1;
print "$no ) ".$row['uname']." | ";
print $row['phone']." | ";
print $row['email']." | ";
print "<br/>";
}
mysqli_close($link);
?>
