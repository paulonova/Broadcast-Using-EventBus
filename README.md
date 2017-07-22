# EventBus

link: http://greenrobot.org/eventbus/

EventBus: Events for Android
EventBus is an open-source library for Android using the publisher/subscriber pattern for loose coupling. EventBus enables central communication to decoupled classes with just a few lines of code – simplifying the code, removing dependencies, and speeding up app development.
EventBus-Android-Publish-Subscribe

Your benefits using EventBus: It…

simplifies the communication between components
decouples event senders and receivers
performs well with Activities, Fragments, and background threads
avoids complex and error-prone dependencies and life cycle issues
is fast; specifically optimized for high performance
is tiny (<50k jar)
is proven in practice by apps with 100,000,000+ installs
has advanced features like delivery threads, subscriber priorities, etc.
Further EventBus Features

Convenient Annotation based API: Convenient Annotation based API: Simply put the @Subscribe annotation to your subscriber methods. Because of a build time indexing of annotations, EventBus does not need to do annotation reflection during your app’s run time.
Android main thread delivery: When interacting with the UI, EventBus can deliver events in the main thread regardless how an event was posted.
Background thread delivery: If your subscriber does long running tasks, EventBus can also use background threads to avoid UI blocking.
Event & Subscriber inheritance: In EventBus, the object oriented paradigm apply to event and subscriber classes. Let’s say event class A is the superclass of B. Posted events of type B will also be posted to subscribers interested in A. Similarly the inheritance of subscriber classes are considered.
Jump start:You can get started immediately – without the need to configure anything – using a default EventBus instance available from anywhere in your code.
Configurable: To tweak EventBus to your requirements, you can adjust its behavior using the builder pattern.
Check out EventBus’ full feature set.

Add EventBus to your project

EventBus is available on JCenter and Maven Central, so just add the dependency to your project.

Get started with EventBus

For first steps with EventBus, please check the documentation / tutorial, especially the getting started guide.

You are using a database?

Check out our performance-optimized Object-Relational-Mapper (ORM) greenDAO, which makes SQLite super-easy and fast to work with.
