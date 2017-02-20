# template-java-project

[![Build Status](https://img.shields.io/travis/pascalpoizat/template-java-project/master.svg?style=flat-square)](https://travis-ci.org/pascalpoizat/template-java-project)
[![Code Coverage](https://img.shields.io/coveralls/pascalpoizat/template-java-project/master.svg?style=flat-square)](https://coveralls.io/github/pascalpoizat/template-java-project)
[![License](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat-square)](LICENSE)
[![Version](https://img.shields.io/badge/version-0.1.0.0-blue.svg?label=version&style=flat-square)](build.gradle)<br/>
[![Codacy Project Certification](https://img.shields.io/codacy/grade/50068fe969da4f8da9895ed9bd9e7897.svg?style=flat-square)](https://www.codacy.com/app/pascalpoizat/template-java-project/dashboard)
<!--[![SonarQube Technical Debt](https://img.shields.io/badge/technical%20debt-0.0%-brightgreen.svg?style=flat-square)](http://localhost:9000/dashboard/index/fr.uparis10.pascalpoizat:template-java-project)-->
[![Issues Ready](https://img.shields.io/github/issues-raw/pascalpoizat/template-java-project/ready.svg?style=flat-square&label=issues%20ready%20for%20development)](https://waffle.io/pascalpoizat/template-java-project)
[![Issues in Progress](https://img.shields.io/github/issues-raw/pascalpoizat/template-java-project/in%20progress.svg?style=flat-square&label=issues%20in%20progress)](https://waffle.io/pascalpoizat/template-java-project)

Template for an Open Source Java project

## dependencies

All the following dependencies are free provided your project is Open Source.

- Source repository and VCS

    We use [GitHub](https://github.com/).
    Of course you can use another VCS here.
    What is nice with GitHub is the integration with Travis CI (see below).
    So here you only have to create a repository.

- Continuous Integration

    We use [Travis CI](https://travis-ci.org/) and its connection to GitHub.
    See [here](https://docs.travis-ci.com/user/for-beginners) how to activate this for your project.
    Then, the provided ```.travis.yml``` and ```build.gradle``` files will do the job.
    
- Issues
 
    We use Github to manage issues. Further, we integrate with [Waffle](https://waffle.io) to show issues that are ready and ones that are in progress.
    See [here](https://guides.github.com/features/issues/) for a documentation on Github issues, and
    [here](https://github.com/integrations/waffle) on how to integrate Waffle to your project.

- Code Analysis

	We use [Codacy](https://www.codacy.com) for code analysis.
	See [here](https://github.com/integrations/codacy) how to activate this for your project.
	
    You may also use [SonarQube](http://www.sonarqube.org/) for code analysis.
    **This is not included in the works made by Travis CI**.
    However, Gradle is configured for using it.
    You only have to run Gradle target ```sonarqube```.
    By default the ```build.gradle``` file works with a local SonarCube server on ```localhost:9000```.
    You will have to install and run your own server there or
    if you have access to another one to complete the information in ```build.gradle```.
    More information is [here](http://docs.sonarqube.org/display/SONAR/Analyzing+with+SonarQube+Scanner+for+Gradle)
    (note that Gradle includes a SonarCube plugin but it will be removed in Gradle 3.0).
    The technical badge, that is commented out in this README file, is not generated automatically.
    You will have to change the value by hand each time you run SonarCube (this is too bad).

- Test Coverage

    We use [JaCoCo](http://eclemma.org/jacoco/) to produce test coverage reports.
    For the time being it does not support excluding private constructors from the analysis.
    Hence you won't get 100% coverage in the reports if you use them
    (e.g., in order to have a good SonarQube technical debt).
    To have JaCoCo support, nothing to do, the provided ```.travis.yml``` and ```build.gradle``` files will do the job.

    We use [Coveralls](https://coveralls.io/) to produce test coverage history and statistics.
    See [here](https://coveralls.zendesk.com/hc/en-us) how to activate this for your project.
    Then, the provided ```.travis.yml``` and ```build.gradle``` files will do the job.
    
    Coverage information can be sent to Codacy (soon ...)

- Logging

    We use [Apache Log4j 2](http://logging.apache.org/log4j/2.x/) for logging.
    A very basic set configuration files, in YAML format, is provided.
    More information is [here](http://logging.apache.org/log4j/2.x/manual/configuration.html).
    Note the use of distinct configurations files for the run (```src/main/resources/log4j2.yml```) and for the test (```src/main/resources/log4j2-test.yml```).
    This enables you, e.g., to log different things and present them in different ways in test or in production.
    Of course different logging APIs can be used instead of Log4j.
    For example if you use ``java.util.logging`` you can remove the Log4j and jackson-dataformat dependencies from ```build.gradle```, and you don't need the Log4j configuration files.

- Licence Badges

    We use [shields.io](https://img.shields.io) to generate the badges.
    
- Documentation (soon ...)

- Web Site (soon ...)

