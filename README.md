INSTRUCTIONS D'UTILISATION - FICHIER README
Informations pour accéder au projet déployé

Pour accéder à votre projet déployé, utilisez l’URL suivante :
https://app-eff886a4-edec-4cf8-9df5-44807211ba11.cleverapps.io.
Une fois que l’application est lancée sur le cloud, vous pourrez y accéder en utilisant cette URL.

Lancer le projet localement
Prérequis

Avant de lancer le projet localement, assurez-vous des éléments suivants :

    Base de données PostgreSQL: Assurez-vous d’avoir PostgreSQL installé sur votre système. Si ce n’est pas le cas, téléchargez et installez-le à partir du site officiel de PostgreSQL.

    Installation de Docker:
        -Rendez-vous sur le site officiel de Docker et téléchargez la version compatible avec votre système d’exploitation.
        
Configuration du Projet

Clonez le dépôt du projet à partir de son emplacement sur Git en utilisant la commande git clone.
Arrêt du service PostgreSQL

Avant de continuer, assurez-vous que votre base de données ne s’exécute pas en utilisant la commande suivante :

bash

sudo service postgresql stop

    Lorsque vous exécutez cette commande, cela envoie une commande au système d’exploitation pour arrêter le service PostgreSQL.
    Cela signifie que PostgreSQL cessera de fonctionner et ne sera plus accessible jusqu’à ce qu’il soit redémarré.

Exécution de l’application avec Docker

Avant de lancer l’application, assurez-vous que votre projet est correctement configuré pour utiliser Docker et qu’il est lié à la base de données. Voici une brève explication du processus :

Dans le fichier cv24v1/docker-compose.yml, vérifiez la configuration de la base de données comme suit :

    Commenter : Dans le fichier de configuration de l’application, commentez ou supprimez les lignes de configuration qui se réfèrent à une base de données distante, et décommentez les lignes de configuration appropriées pour une base de données locale, dans le fichier src/main/resources/application.properties.

    Décommenter : les configurations de base de données locales dans Spring.

Lancement de l’application

Une fois que votre projet est configuré correctement, vous pouvez procéder à l’exécution de l’application avec Docker :

    Assurez-vous que votre application est construite correctement en utilisant la commande suivante :

    bash

mvn clean package -DskipTests

Ensuite, utilisez la commande suivante pour construire les conteneurs définis dans le fichier cv24v1/docker-compose.yml :

bash

docker compose build

Enfin, lancez les conteneurs avec la commande :

bash

    docker compose up

Vérification de l’application

Pour accéder à l’application, ouvrez votre navigateur web et allez à l’URL suivante : http://localhost:8080/. Cela vous dirigera vers la page d'accueil de l'application.
