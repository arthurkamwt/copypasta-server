# Copypasta server

Template for a simple embedded server. You can simply `gradle run` this, or deploy it to a docker container.

Uses Jersey as the JAX-RS implementation.

## Getting started

### Prerequisites

* [Gradle](https://gradle.org/)
* [Docker](https://www.docker.com/) (optional, but recommended)

### Installing

Not sure how this whole GitHub template thing works for other people. TBD

## Deployment

Uses [Google's Jib](https://github.com/GoogleContainerTools/jib/) to containerize the server. Do whatever you need.

## Built with

* [Jersey2](https://eclipse-ee4j.github.io/jersey/) - JAX-RS implementation
* [Grizzly](https://javaee.github.io/grizzly/) - embedded container
* [HK2](https://javaee.github.io/hk2/) - dependency injection

### Tooling

* [Gradle](https://gradle.org/) - build
* [Ktlint](https://ktlint.github.io/) - formatting
* [Jib](https://github.com/GoogleContainerTools/jib/) - containerization
* [Docker](https://www.docker.com/) - containerization

## License

MIT [license](/LICENSE)
