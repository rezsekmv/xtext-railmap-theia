# xtext-railmap-theia

Make sure you have java 1.8-jdk and gradle installed

Commands:

$ git clone https://github.com/kulcsii/xtext-railmap-theia.git

$ cd railmap-language-server/     //cd to the language server
$ ./gradlew shadowJar             //build the language server 

$ cd ..                           //cd to root
$ yarn install                    //build Theia

$ cd app/                         //cd to app
$ yarn start                      //start Theia with default parameters (on localhost:3000)
