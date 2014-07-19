This code expects you have a database with user hpi and password hpi which can access all databases 
but then using the database prefix. E.g. select * from test1.hans
For this reason you need the below schema files (plus reference from persistence.xml). 
If you create separate users with direct access to the database you don't need the schema files.

The generate script is used to generate

* entity producers
* entity qualifiers
* beans
* persistence.xml units
* schema files

All the above was already executed and is parte of the source.

The below you still need to do

* databases
* data in db's
* jboss datasources