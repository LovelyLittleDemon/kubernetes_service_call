rm -rf images
mkdir images
build_micro_server(){
  echo "build_micro_server: $1 start"
  mvn clean
  mvn package
  sudo docker rm ${1}
  sudo docker build -f docker/Dockerfile -t ${1}:${2} .
  sudo docker save -o images/${1}_${2} ${1}
  #sudo docker images | grep ${1} | awk '{print $3 }'|xargs sudo docker rmi
}



build_micro_server kes-service v0.1

#build_micro_server micro-system v0.1
sudo chmod 777 images -R
