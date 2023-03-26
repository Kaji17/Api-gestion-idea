### API REST APPLICATION DE GESTION D'IDEE

### DOCUMENTATION API

## GET http://localhost:8881/api-gest-idee-v1.0.0/idees

Resultat: 
[/n
    {/n
        "id": 1,
        "title": "Mon premier titre",
        "content": "Premiere API Java Spring",
        "status": 1,
        "lastmodif": "2023-03-26T00:00:00.000+00:00"
    }
]

## POST  http://localhost:8881/api-gest-idee-v1.0.0/idees

Paramètre à passer dans le Body de la requete:
{
    "title": "Mon deuxième titre",
    "content": "I Love Spring-Boot",
    "status": 0,
    "lastmodif": "2023-03-26T00:00:00.000+00:00"
}

## PUT http://localhost:8881/api-gest-idee-v1.0.0/idee/{id}

L'id à passer dans la requette est un entier:
{
    "id": 1,
    "title": "Premier Titre modifié",
    "content": "Premiere API Java Spring-boot le fais des action CRUD",
    "status": 1,
    "lastmodif": "2023-03-26T00:00:00.000+00:00"
}

## DELETE http://localhost:8881/api-gest-idee-v1.0.0/idee/{id}

Supprime l'idée passer en paramètre

