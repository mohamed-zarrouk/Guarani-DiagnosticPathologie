# Guarani-DiagnosticPathologie

*********************************************************************************
Guarani Coding Test - Diagnostic Pathologie - 25 Avril 2025

*********************************************************************************
Contexte:

Mon hôpital du futur dispose d'une cabine automatisée d'auto-diagnostic. Le capteur de la cabine donne
une information synthétique qu'on appelle "index de santé" du patient.
L'index de santé est une valeur interprétable qui permet d'établir la pathologie du patient :
Un index multiple de 3 indique un problème cardiaque.
Un index multiple de 5 indique une fracture.
Un index multiple de 3 et de 5 indique ces deux pathologies à la fois.
En fonction de la pathologie, la cabine doit rediriger le patient vers l'unité médicale adaptée au sein de
l'hôpital :
On traite les problèmes cardiaques en cardiologie.
On traite les fractures en traumatologie.
Si le patient a plusieurs pathologies, il devra passer par chacune des unités médicales concernées
(l'ordre n'a pas d'importance).

Exemples :
Pour l'index de santé 33, le système doit renvoyer Cardiologie.
Pour l'index de santé 55, le système doit renvoyer Traumatologie.
Pour l'index de santé 15, le système doit renvoyer Cardiologie, Traumatologie.

*********************************************************************************
Technologies: Java 8, Test JUnit 5

*********************************************************************************
Méthodologie: TDD

*********************************************************************************
