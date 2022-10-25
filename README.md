Activité Pratique N° 1
Développement d'un Web service SOAP, WSDL avec JAWRS

Travail à faire
1-	Créer un Web service qui permet de :
•	Convertir un montant de l’auro en DH
•	Consulter un Compte
•	Consulter une Liste de comptes 
2-	Déployer le Web service avec un simple Serveur JaxWS 
3-	Consulter et analyser le WSDL avec un Browser HTTP 
4-	Tester les opérations du web service avec un outil comme SoapUI ou Oxygen
5-	Créer un Client SOAP Java
6-	Créer un Client SOAP Dot Net
7-	Créer un Client SOAP PHP
8-	Déployer le Web Service dans un Projet Spring Boot
![image](https://user-images.githubusercontent.com/4341904/197864940-57e26b8c-9ea4-4352-9fd9-62517bfbd1d4.png)






Dépendance de JAXWS :
 ![image](https://user-images.githubusercontent.com/4341904/197864901-643ee9f2-3b8b-4f53-8c81-44b8210fd5ff.png)
 
Partie serveur :
Classe « Compte » (métier) :
 ![image](https://user-images.githubusercontent.com/4341904/197864866-38bc2f2f-f052-4ecf-9faf-f93124e76446.png)


La classe « BanqueWS » (WebService) :
![image](https://user-images.githubusercontent.com/4341904/197864848-f43ef640-338d-48a0-8f77-bb1d7038ccf8.png)
 

La classe configuration du serveur :
 ![image](https://user-images.githubusercontent.com/4341904/197864826-5d4574da-6c2f-4c2c-90d1-dc9e0dce1873.png)



Le WSDL :
 ![image](https://user-images.githubusercontent.com/4341904/197864791-d97360d8-5941-4aac-8e9d-d22286529984.png)



Test du WebService :
Méthode Convert
 ![image](https://user-images.githubusercontent.com/4341904/197864734-667f5ba7-bfc1-45ad-9eab-7dadf0cf5462.png)

Méthode getCompte
 ![image](https://user-images.githubusercontent.com/4341904/197864713-7a7d0dbf-c760-43d9-ac29-a078d67d9b76.png)


listComptes
 ![image](https://user-images.githubusercontent.com/4341904/197864688-b37bfe9a-e10e-4e71-96bc-84a851c2b206.png)

 
Partie Client : 
Générer le code Java à partir du WSDL :
 ![image](https://user-images.githubusercontent.com/4341904/197864655-9f4a5ba6-8d09-432f-95da-4aec50f2da16.png)

Stubbing :
![image](https://user-images.githubusercontent.com/4341904/197864603-6b10e6b1-2153-47e4-a56e-1bf004f30f06.png)

Résultat :
![image](https://user-images.githubusercontent.com/4341904/197864577-9437c4a2-86a0-4149-90ad-af29b81b3967.png)

Repositories GitHub :
https://github.com/ilyasseelmoulaoui/Act1-WebService
https://github.com/ilyasseelmoulaoui/Act1-Client-SOAP

