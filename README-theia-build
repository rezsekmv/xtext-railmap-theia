SETTING UP YOUR LANGUAGE SERVER:

1) Copy your own language servert to the root folder

2) Build it with ./gradlew shadowJar

Common mistakes:
    -make sure, you are using java open-jdk-1.8
    -make sure, you have node, npm installed
    -make sure, you have gradle installed

=============================================================
    
    
SETTING UP THEIA:

1) Copy all files from theia-example

2) -Set your workspace in app/package.json-> scripts-> start
   -Create your workspace folder to the root. (With the same name ofc)
   
-------------------------------------------------------------

dsl-extension:

1)  package.json-> scripts-> copy-ls: exchange with your own   path to the .jar file
    like this: ../your-language-server-root/your-language-server-root.ide/build/libs/your-jar-file-name.jar
    (your have your filename in the libs folder, if you build succesfully your language server)

2) src/node/backend-extensions.ts:
    -at the path give your .jar file name, what you have just added at 1)
    -write your own language to id and name

3) src/browser/language-contribution.ts:
    -write every dsl to your own language name
    
-------------------------------------------------------------

Build theia:

    In the root directory:  $ yarn install
    
Run theia:
    
    In the app directory:   $ yarn start
    
    /theia will start on localhost:3000 by default, you can change this with yarn start parameters/


-------------------------------------------------------------


EXTRAS:

Monaco:
    If you want to personalise the syntax highlight, you have to modify the xtext-dsl-extension/src/browser/language-contribution.ts file
    Great tutorial: https://microsoft.github.io/monaco-editor/monarch.html
    
Gitpod:
    You have to add a gitpod.yml file to your root folder!
