# xtext-railmap-theia

#### Requirements:

Make sure you have `openjdk-1.8-jdk`, `gradle`, `yarn` and `nodejs` installed

To install those:
```
$ sudo apt-get install openjdk-8-jre
$ sudo apt-get install gradle
$ sudo apt-get install yarn
$ sudo apt install nodejs
```

If you have jdk-8 already on your computer, you can switch between java versions:
```
$ sudo update-alternatives --config java
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
