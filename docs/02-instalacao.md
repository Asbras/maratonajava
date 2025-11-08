## Instalação do Java no Linux

Instale o **JDK 17** (LTS) para compilar e executar:

### Ubuntu / Debian

```bash
sudo apt update
sudo apt install openjdk-17-jdk -y
java -version
javac -version

# Fedora/Red Hat
sudo dnf update
sudo dnf install java-17-openjdk-devel
java -version
javac -version

# Configuração opcional da variável JAVA_HOME
echo "export JAVA_HOME=$(dirname $(dirname $(readlink -f $(which javac))))" >> ~/.bashrc
source ~/.bashrc 
```