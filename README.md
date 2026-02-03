# jME Maven Starter

Projet Java Maven "clé en main" pour démarrer avec **jMonkeyEngine 3** (LWJGL3) sans NetBeans, compatible Eclipse.

## Prérequis

- **JDK 17+** (recommandé : Temurin/Adoptium).
- **Maven 3.8+**.

> **Version jME3 choisie :** `3.6.1-stable` (version stable largement utilisée et compatible Java 17).

## Structure Maven

```
src/
  main/
    java/         # sources Java
    resources/    # ressources et assets
  test/
    java/         # tests
```

## Commandes

```bash
mvn clean test
mvn clean package
mvn -q exec:java
```

## Import dans Eclipse

1. **File > Import > Maven > Existing Maven Projects**
2. Sélectionner le dossier du repo
3. Valider l’import

## Lancer l’application jME

La classe principale est : `com.example.jmestarter.Main`.

Pour exécuter via Maven :

```bash
mvn -q exec:java
```

## Assets (jME)

- Placez vos assets dans `src/main/resources/assets/`.
- Le classpath racine des assets est `src/main/resources`.
  Exemple de chargement : `assetManager.loadTexture("Textures/MyTexture.png")`.

## Notes

- Le projet utilise **LWJGL3** via `jme3-lwjgl3`.
- Le `pom.xml` centralise les versions (Java, jME, SLF4J) pour faciliter la maintenance.
