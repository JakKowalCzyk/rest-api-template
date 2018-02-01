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
    - apiTemplate-api:
        - pom.xml:
            - s3 bucket name and directory of project - storing needed modules in s3
            - docker image name
            - docker repo name
        - module name,  groupId, artifactId
        - properties:
            - db url
            - db name
        - swagger config(name, desc)
        - ExampleController & ExampleMapper
        - Dockerfile
    - travis.yml:
        - path to api
        - branch to build
        - docker image name
        - docker repo name
    - travis:
        - docker login & pass
        - access_keys
    - scripts:
        - docker-compose:
          - db name
          - docker image name
          - docker repo name
          - ports
          - volumes
          - envs