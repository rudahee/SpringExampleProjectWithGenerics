# Spring Example Project With Generics

The goal of this project is to make a template to use in other projects.

This template is designed to use generic types throughout the entire project, thus saving code repetition, being more readable and compact as the number of necessary classes increases.


## Estructura Proyecto
----
```java
com
|_ example
    |_ controller
    |   |_ BaseController.java              [Interface]
    |   |_ BaseControllerImpl.java          [Abstract]
    |   |_ ExampleEntity1Controller.java    [Class]
    |   |_ ExampleEntity2Controller.java    [Class]
    |
    |_ model
    |   |_ entity
    |   |    |_ BaseEntity.java             [Abstract]
    |   |    |_ ExampleEntity1.java         [Class]
    |   |    |_ ExampleEntity2.java         [Class]
    |   |
    |   |_ repository
    |       |_ BaseRepository.java          [Interface]
    |       |_ ExampleEntity1Repo.java      [Interface]
    |       |_ ExampleEntity2Repo.java      [Interface]
    |
    |_ service
        |_ AbstractPersistenceService.java  [Abstract]
        |_ BaseService.java                 [Interface]
        |_ ExampleEntity1Service.java       [Class]
        |_ ExampleEntity2Service.java       [Class]
        |_ IExEntity1.java                  [Interface]
        |_ IExEntity2.java                  [Interface]
```

---
### **/!\ It is still in the process of improvement, but its fully functional**
