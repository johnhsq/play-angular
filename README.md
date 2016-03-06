# Play + Angular 


## What is this repository for? ##

* Demo using Play Framework to create REST Service
* Demo using AngularJS to create Web UI to access the REST Service


## How do I get set up? ##
### Setup Client ###
```
  $ mkdir -p <project>/client
  $ cd <project>/client
  $ yo angular //choose: Grunt, no Sass, yes Bootstrap, default for the rest
  $ npm install -g grunt-cli
  $ npm install
  $ bower install
  $ npm install --save --dev karma
  $ grunt serve
```
You should be able to access  http://localhost:9000 now

### Setup Client ###
```
  $ brew install typesafe-activator
  $ cd <project>
  $ activator new server play-java
  $ cd server
  $ activator run
```

### Connect Server and Frontend using Grunt proxy (for dev enviornment only)
```
  $ cd client
  $ npm install grunt-connect-proxy --save-dev
```
Configure Gruntfile.js with proxy 

