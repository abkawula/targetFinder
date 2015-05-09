targetFinder README

Building targetFinderService

	using maven, "mvn package"

Starting targetFinderService

	java -jar target/targetfinder-rest-1.0.jar server tf.yml
	
	With Debug:
	
	java -Xdebug -Xrunjdwp:transport=dt_socket,address=8998,server=y,suspend=n -jar target/targetfinder-rest-1.0.jar server tf.yml

Environment specific setting are the .yml file.  The checked in version is for trunk-dev.  Modify as needed via a deployment tool 
to make it work in another environment.

Usage:

	To register a new unmapped file with targetFinder	
	GET /event

	
