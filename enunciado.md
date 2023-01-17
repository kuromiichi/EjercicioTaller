# Problema

50 personas (10% aleatoriamente JT, 30% chapistas, 10% electricistas, resto trabajadores normales)

Calcular nómina:
    - 2500 JT
    - 1200 T
    - 1700 C
    - 1800 E

Calcular:
    - Lista de todos los trabajadores
    - Salario total
    - Nº jefes de taller
    - Nº trabajadores (total)
    - Nº chapistas
    - Nº electricistas
    - Nº trabajadores no chapistas
    - Nº trabajadores no electricistas
    - Nº trabajadores no chapistas ni electricistas

# Persona
    ## Estado
    id (autonumérico)
    nombre
    experiencia
    salario

    ## Comportamiento
    saludar

# Jefe Taller : Persona
    ## Estado
    personas a su cargo

    ## Comportamiento
    dar latigazos
    pagar
    saludar (chulesco)

# Trabajador : Persona
    ## Estado
    horas diarias
    
    ## Comportamiento
    trabajar
    saludar (con respeto)
    descansar
    comer (no se define)

# Chapista : Trabajador
    ## Comportamiento
    arreglar chapa
    descansar

# Electricista
    ## Comportamiento
    arreglar electricidad
    comer
