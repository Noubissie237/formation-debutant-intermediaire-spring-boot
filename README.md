<img src ='https://miro.medium.com/1*os-kEY6vkmhbx3TEznlOng.png' width='500'>

#  Formation Spring Boot – De Débutant à Développeur Professionnel

Bienvenue dans cette formation complète Spring Boot !
L’objectif est de te guider pas à pas pour comprendre, maîtriser et déployer une application moderne en Java avec Spring Boot, l’un des frameworks les plus utilisés dans le monde du développement backend.

Cette formation est organisée en modules progressifs, orientés pratique, avec un projet concret qui évolue au fil des vidéos.

---

## Objectifs de la formation 

* Comprendre les bases de Spring Framework et Spring Boot
* Créer une API REST professionnelle (CRUD complet)
* Utiliser Spring Data JPA pour la persistance des données
* Documenter ton API avec OpenAPI / Swagger
* Mettre en place validation, logs, gestion des erreurs
* Ajouter une couche de sécurité avec Spring Security
* Tester ton application et préparer le déploiement
* Découvrir Docker et les profils Spring pour la production

---

## Plan de la formation (Modules)

### **Module 1 – Mise en place de l’environnement & création du projet**

**Objectifs :** Préparer ton environnement et créer ton premier projet Spring Boot.

**Contenu :**

* Installation du JDK, Maven/Gradle et IDE
* Découverte de Spring Initializr
* Génération du projet Spring Boot
* Présentation de la structure du projet
* Lancement de l’application avec Tomcat embarqué

---

### **Module 2 – Comprendre Spring Boot & l’architecture d’une application**

**Objectifs :** Comprendre comment fonctionne Spring Boot et organiser ton application.

**Contenu :**

* Analyse de la classe principale et du rôle de `@SpringBootApplication`
* Injection de dépendances : `@Component`, `@Service`, `@Repository`
* Architecture MVC : Controller → Service → Repository → Database
* Découverte des fichiers de configuration (`application.properties` / YAML)

---

### **Module 3 – API REST : Controllers, DTOs & validation**

**Objectifs :** Construire une API REST propre, structurée et validée.

**Contenu :**

* Création de controllers REST (`@RestController`)
* Routes REST : `@GetMapping`, `@PostMapping`, etc.
* Utilisation des DTOs pour séparer modèle et transfert
* Validation des données : `@NotNull`, `@Email`, `@Valid`, etc.
* Gestion des entrées utilisateurs et conventions de routing

---

### **Module 4 – OpenAPI / Swagger : Documenter son API**

**Objectifs :** Ajouter une documentation interactive pour ton API.

**Contenu :**

* Installation de Springdoc OpenAPI
* Accès à Swagger UI (`/swagger-ui/index.html`)
* Documentation automatique des endpoints
* Ajout de métadonnées (titre, description, version)
* Documentation manuelle avec `@Operation`, `@ApiResponse`, etc.

---

### **Module 5 – Persistence des données avec Spring Data JPA**

**Objectifs :** Sauvegarder, lire et manipuler des données via JPA.

**Contenu :**

* Configuration d’une base de données (H2, PostgreSQL, etc.)
* Création d’une entité JPA (`@Entity`)
* Création d’un `Repository` (`extends JpaRepository`)
* Mise en place d’une couche de service
* Intégration avec les controllers pour un CRUD complet

---

### **Module 6 – Gestion des erreurs, logs & bonnes pratiques**

**Objectifs :** Rendre ton API robuste, propre et professionnelle.

**Contenu :**

* Gestion globale des exceptions avec `@RestControllerAdvice`
* Messages d’erreurs uniformes et structurés
* Utilisation de SLF4J / LoggerFactory (`info`, `debug`, `error`)
* Meilleures pratiques de structure, nommage et découpage des packages

---

### **Module 7 – Sécurité avec Spring Security (et éventuellement JWT)**

**Objectifs :** Protéger ton API avec authentification et autorisation.

**Contenu :**

* Installation et configuration de Spring Security
* Fonctionnement de la sécurité par défaut
* Création d’un `SecurityFilterChain`
* Gestion des routes publiques et privées
* Authentification simple (en mémoire)
* Introduction aux JWT (optionnel pour débuter)

---

### **Module 8 – Tests, profils & déploiement (Docker / prod)**

**Objectifs :** Préparer ton application pour la production.

**Contenu :**

* Tests unitaires et tests d’intégration (`@SpringBootTest`)
* Configuration des profils Spring (dev, prod)
* Création du jar exécutable et lancement en CLI
* Introduction à Docker : Dockerfile, image, conteneur
* Bonnes pratiques pour le déploiement

---

## Projet final de la formation

Au fil des modules, nous allons construire une **API REST complète**, comprenant :

* Gestion d’une ressource (ex. : utilisateurs, rendez-vous, etc.)
* CRUD complet : création, lecture, mise à jour, suppression
* Validation des données
* Documentation automatique avec Swagger
* Persistante réelle avec JPA
* Sécurité intégrée (Spring Security)
* Tests de base
* Version déployable avec Docker

---

## Vidéos et ressources

Les vidéos sont en cours de préparation.
Elles seront ajoutées progressivement.

Chaque module comportera :

* Des vidéos explicatives
* Le code source associé

---

## Contact & support

Si tu as des questions, tu peux :

* Me contacter via mon [portfolio](https://noubissie.propentatech.com) en cliquant [ici](https://noubissie.propentatech.com/contact)
* Laisser un commentaire sous les vidéos (YouTube)
* Ouvrir une issue sur [GitHub](https://github.com/Noubissie237/formation-debutant-intermediaire-spring-boot.git) pour le code source

---
