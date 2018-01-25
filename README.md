REST API template:

- modular template for developing REST APIs
- Spring Boot
- Things to customize and replace:
    - Project name and modules names
    - Root pom.xml: 
        - groupId & artifactId 
        - s3 bucket name and directory of project - storing needed modules in s3
    - apiTemplate-model:
        - module name, groupId, artifactId
        - ExampleModel class
    - apiTemplate-core:
        - module name,  groupId, artifactId
        - ExampleDAO class