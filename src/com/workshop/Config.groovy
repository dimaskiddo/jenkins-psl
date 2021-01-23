#!/usr/bin/groovy
package com.workshop

class Config {
  // Docker related default variable
  def default_docker_registry = "https://registry-1.docker.io/v2/"
  def default_docker_registry_jenkins_cred = 'docker-dimaskiddo'

  // Docker related default variable
  def default_docker_jenkins_tool = 'docker'

  // Golang related default variable
  def default_golang_base_image = "dimaskiddo/tkpd-demo:onbuild"
}