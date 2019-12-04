# xtext-railmap-theia

#### Requirements:

Make sure you have `openjdk-1.8-jdk` and `gradle` installed

To install those:
```
$ sudo apt-get install openjdk-8-jre
$ sudo apt-get install gradle
```
#### Commands:

Clone the repository:
```
$ git clone https://github.com/kulcsii/xtext-railmap-theia.git
```

Build the language server:
```
$ cd railmap-language-server/     //cd to the language server
$ ./gradlew shadowJar             //build the language server 
```

Build Theia:
```
$ cd ..                           //cd to root
$ yarn install                    //build Theia
```

Start Theia:
```
$ cd app/                          //cd to app
$ yarn start                      //start Theia with default parameters (on localhost:3000)
```
