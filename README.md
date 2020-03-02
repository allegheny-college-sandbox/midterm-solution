# CMPSC 100-02 Mid-term exam

* Assigned: 2 March 2020
* Due: 12 March 2020 by 1:30 PM
* Point value: 100

This exam explores various concepts up to our work with `reference types`. This exam is cumulative and potentially covers all knowledge gained up to this point in the course.

* [Slack](https://cmpsc-100-02-sp-2020.slack.com)
* [GitHub](https://www.github.com)
* git
* [Atom](https://atom.io)
* [Docker](https://www.docker.com/products/docker-desktop)
* GatorGrader
* gradle

## Table of contents

* [Evaluation](#evaluation)
* [Accepting the assignment](#accepting-the-assignment)
* [G. Wiz buys some widgets](#g-wiz-buys-some-widgets)
* [GatorGrader](#gatorgrader)

## Accepting the assignment

- [ ] Log into the `#general` channel in our class [Slack](https://cmpsc-100-02-sp-2020.slack.com)
- [ ] Click the link provided for the exam and accept it in GitHub classroom
- [ ] Once the assignment finishes building, click the link to go to your personal repository assignment

## "Cloning" a repository

### Using the correct download link

- [ ] On this repository's page, click the `Clone or download` button in the upper right hand corner
    * You may need to scroll up to see it
- [ ] In the upper right corner of the box that appears, click `Use SSH`
- [ ] Copy the link that appears in the textbox below the phrase "Use a password with a protected key"

### Cloning

- [ ] Type `ls` in your terminal window
    * You should be in your `CMPSC100` directory
- [ ] Change directories (`cd`) to your `Practicals` folder
- [ ] Once in the `Practicals` folder, "clone" the repository using the link copied above
   * If I (the instructor) were to clone my own repository, I'd enter (your link will look different):
   
```
git clone git@github.com:allegheny-college-cmpsc-100-spring-2020/cmpsc-100-spring-2020-midterm-code-completion
```

## G. Wiz buys some widgets

What's a widget? Who knows?! G. Wiz does.

### The output

The following is an _example_ created using a test case scenario. Your code should be able to accept a wide variety of values for the `member discount rate`, and your test case numbers may look slightly different. However, your program should pass my test case below.

```
Thingamajig     $13.37	42.12 lbs.
The Zonk	      $19.79	34.23 lbs.
Maguffin	      $18.94	2.21 lbs.
Whatchamacallit	$13.37	112.32 lbs.
A Gadget	      $119.33	41.12 lbs.

Enter member discount rate: ##

Price before discount: 184.8
Member discount applied: ##.##%
Final price: 150.64896000000002, Total weight: 232.0
Cost to ship: 76.56
Final total: 227.20896000000002
```

## Evaluation

For the purposes of this assignment, complete could should:

- [ ] Pass `gradle build` and `gradle -q --console plain run`
    * This ensures both _legible_ and _runnable_ code

### `WidgetBill.java`

- [ ] Contains no `TODO` markers
- [ ] Contains no `{Your Name Here}` markers

### `Widget.java`

- [ ] Exists, **_untouched_**

You do not need to (and _should not_) make changes to this file.

## GatorGrader

### A note about `gradle`

`gradle` is a program which manages our program's many moving parts. It coordinates building, testing, compiling, and running our code -- tasks that will become more complex over the course of the semester in direct proportion to the complexity of our programs. There are two "tasks" that we will use extensively in this course.

#### `gradle build`

`gradle build` compares code against a set of convetions ("best practices") for creating legible code. There are many different standards for doing this, but our department chooses to follow the [Google Style Guide for the Java language](https://google.github.io/styleguide/javaguide.html). This includes such rules as:

* Each "level" of code being indented by 2 spaces
* Not using single-letter identifiers
* Enforcing consistent use of "Javadoc" (and other) comments
* ... and more!

These kinds of standard make reading code much easier, and help folks like our Technical Leaders (and me) read your code to figure out where something isn't going as planned.

#### `gradle run` (and its variants)

`gradle run` (and its counterpart `gradle -q --console plain run`) compile and run our Java programs. Once again, this will become more handy when we start to build projects that require _multiple_ files.

#### `gradle grade`

`gradle grade` runs the GatorGrader application. This application uses grading standards _specific to an assignment_. This means that the grading files created when you accept an assignment are the same ones by which I will evaluate your work: _once you've cloned an assignment, they do not change_.

You will use this command to grade your work before you turn it in, enabling you to know before I grade it what your grade will be.

### Docker `container`

#### Running GatorGrader directly on `container` start

- [ ] `cd` to your `CMPSC100` folder
- [ ] Locate the `cmpsc-100-spring-2020-midterm-code-completion` folder and `cd` to it.
    * Remember that if you run `ls -la`, you should see a `.git` folder if you're in the main repository folder.
- [ ] To make sure you're in the right repository, type `pwd` and press `Enter`
    * If you recieve the expected path, you're in the right place!

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator
```

#### Run `gradle` commands in the container`

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator bash
```

- [ ] To `build` your Java work, type `gradle build` at the `command` prompt and press the `Enter` key
- [ ] To `run` your Java work, type `gradle -q --console plain run` at the `command` prompt and press the `Enter` key
- [ ] To `grade` your Java work, type `gradle grade` at the `command` prompt and press the `Enter` key

## Submitting the assignment/saving progress

The GitHub platform is a place to store your work. So, it makes some sense that should be able to _clone_ (download) from it, and push back (upload) to it. Here, we'll learn this second part.

- [ ] `cd` to your `CMPSC100` folder
- [ ] Locate the `cmpsc-100-spring-2020-midterm-code-completion` folder and `cd` to it

Once in this folder, we need to tell git that there have been changes.

- [ ] Type `git add .` and press `Enter`
* This tells git to look through the _entire_ folder structure for new changes and "stage" them

- [ ] Type `git commit -m "{Commit message}"` to "label" the commit
* This is typically something like `git commit -m "Fixing a typo"` -- the message in quotes should be as descriptive as possible, while still remaining somewhat short

- [ ] To send all changes to the server, type `git push`
- [ ] At the prompt, input the password associated with the `SSH Key` you created earlier in this exercise (yesterday)

Once the process finishes successfully, we're done!