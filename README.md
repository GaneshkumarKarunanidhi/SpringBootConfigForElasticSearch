# Project Details 

Hello All,<br>
 	&nbsp;	&nbsp;   	&nbsp; This project provides a simple setup for connecting to Elasticsearch 8 via Spring Boot. The approach involves overriding the default Spring autoconfiguration to create a custom Elasticsearch connection.

The core functionality of the project is to establish a connection to Elasticsearch and retrieve its version. This serves as a basic template for connecting to Elasticsearch, which you can expand and customize based on your needs.


### Configuration
Before starting, you need to define the following properties in your application.properties

```
spring.elasticsearch.uris=elastic_search_uri
spring.elasticsearch.username=your_userName
spring.elasticsearch.password=your_password
```

In the spring.elasticsearch.uris property, specify the IP address of your Elasticsearch instance (e.g., 110.***.**.**). If you're running Elasticsearch locally, use localhost.

#### Note : The default Elasticsearch port is 9200, so you don't need to specify it explicitly. Spring Boot will automatically connect to http://<your_elasticsearch_uri>:9200 unless a different port is provided.
Once you've added the properties, the application will automatically establish a connection to your Elasticsearch instance.


### Sample screen shot 
<img width="599" alt="Screenshot 2024-11-29 084348" src="https://github.com/user-attachments/assets/312950c4-44b2-4ea0-b8d2-035c04a910c3">

# Happy Coding :ringed_planet: :sparkles:
