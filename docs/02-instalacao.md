## Instalação do Java no Linux

Para compilar e executar programas em Java, é necessário instalar o **JDK (Java Development Kit)**.

---

### Ubuntu/Debian

```bash
sudo apt update
sudo apt install openjdk-17-jdk -y

# Verifique a instalação
java -version
javac -version
```

---

### Fedora

```bash
sudo dnf update
sudo dnf install java-17-openjdk-devel -y

# Verifique a instalação
java -version
javac -version
```

---

### Arch Linux / Manjaro

```bash
sudo pacman -Syu jdk17-openjdk
# Verifique a instalação
java -version
javac -version
#Caso utilize o AUR, também é possível instalar via yay:
yay -S jdk17-openjdk
```

---

### Configuração da variável JAVA_HOME

```bash
echo "export JAVA_HOME=$(dirname $(dirname $(readlink -f $(which javac))))" >> ~/.bashrc
echo "export PATH=\$PATH:\$JAVA_HOME/bin" >> ~/.bashrc
source ~/.bashrc
```