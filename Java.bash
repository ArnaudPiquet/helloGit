#!/bin/bash
# bash hello Java
#
startMessage="Initialisation";
stopMessage="Fin du programme";
sourceJava="public class Main {
    public static void main(String[] args) {
        System.out.println(\"Hello, World\");
    }
}";
echo $startMessage;
rm -rf src/;
mkdir src;
echo $sourceJava >> ./src/Main.java;
cd ./src;
javac Main.java; 
ls;
echo -e "Compile ok, On lance le prg\n";
java Main;
echo -e "\non retire les src";
cd ..;
rm -rf src/; 
echo $stopMessage;
