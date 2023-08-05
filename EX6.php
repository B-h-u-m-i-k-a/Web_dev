<html>
<head>Display Form</head>
<body>
<?php

$name=$_POST["mname"];
$mode=$_POST["paymode"];

$item1=0;
$item2=0;
$item3=0;
$item4=0;

$price1=20.39;
$price2=40.20;
$price3=30.95;
$price4=70.49;

if(isset($_POST['option1']))
$item1=$_POST['VAL1'];

if(isset($_POST['option2']))
$item2=$_POST['VAL2'];

if(isset($_POST['option3']))
$item3=$_POST['VAL3'];

if(isset($_POST['option4']))
$item4=$_POST['VAL4'];

$total1=$item1*$price1;
$total2=$item2*$price2;
$total3=$item3*$price3;
$total4=$item4*$price4;
$total=$total1+$total2+$total3+$total4;
$total+=($total*13.5)/100;

print("</br> User Name:$name");
?>
<h3> You have ordered following items</h3>
<table border=1>
<tr><th>Item</th><th>Qty</th><th>Price</th><th>Total</th></tr>

<tr><td>Four 100 watt bulbs for Rs. 20.39</td>
<td><?php print("$item1");?></td>
<td><?php print("$price1");?></td>
<td><?php print("$total1");?></td></tr>

<tr><td>Eight 100watt bulbs for Rs 40.20</td>
<td><?php print("$item2");?></td>
<td><?php print("$price2");?></td>
<td><?php print("$total2");?></td></tr>

<tr><td>Four 100watt long life bulbs for Rs. 30.95</td>
<td><?php print("$item3");?></td>
<td><?php print("$price3");?></td>
<td><?php print("$total3");?></td></tr>

<tr><td>Eight 100watt long life bulbs for Rs 70.49</td>
<td><?php print("$item4");?></td>
<td><?php print("$price4");?></td>
<td><?php print("$total4");?></td></tr>

</table>
</br>
</br>
<?php print("Total bill including 13.5% tax:<b> $total </b>");?>
<?php print("payment mode:<b> $mode </b>");?>
</body>
</html>
