<?php 
$pull = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

$MAX_LENGTH = 18;

$outputData = "";
while(strlen($outputData)<$MAX_LENGTH){
    $outputData .= substr($pull,random_int(0,strlen($pull)),1);
}
echo $outputData.PHP_EOL;
?>