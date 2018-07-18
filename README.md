# spring-multimodules

The goal of this exercise is demonstrate how I've been organizing my spring application in multiple submodules. 

I'm not a fan of having all layers of your microservice (even being small) in the same module. 

So, here it goes.


# Modules

I've separated my app in 4 layers:

* **sm-server:** that's the actual Spring Boot App. This module is responsible for generating a deployable artifact.
* **sm-api:** has the contract of the service. Basically RestControllers all over it.
* **sm-business:** it's the business log Facade. I like to have it separated when I'll expose the logic trough different interfaces (e.g Rest, Messaging, CLI, etc.)
* **sm-repositories:** Data Access Layer. Easy. 

They are just references. I know everyone has it's own option about how to organize modules inside of an service. 
I'm focusing more about the technicality of how to achieve that, more than which layers you should have.  

The Module Dependencies should 
![Modules](https://github.com/simundi/spring-multimodules/blob/master/imgs/modules.png)


# Modules Conventions

I normally use some conventions in my modules.

1. packages are '<group name>.<app name>.<module name>' 
   * Examples: 
      * com.simundi.multimodules.**server**
      * com.simundi.multimodules.**repositories**
2. Each module has it's own Configuration class. This class is responsible for bootstraping the module itself.
   * Examples: 
      * com.simundi.multimodules.api.config.ApiModuleConfig
      * com.simundi.multimodules.repositories.config.RepositoryModuleConfig      
     
     