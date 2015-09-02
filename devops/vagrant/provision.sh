#!/usr/bin/env bash

sudo apt-get install software-properties-common
sudo apt-add-repository ppa:ansible/ansible
sudo apt-get update
sudo apt-get -y install ansible
ansible-playbook /var/ansible/devenv.yml