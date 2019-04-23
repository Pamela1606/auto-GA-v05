Feature: Home

  Scenario: Cargar Pagina
    Given go Home pagina cargada
    And Hover Men link Header
    And Click fubtbol link Calzado column
    And Obetener valores del primer calzado de futbol
    And Click Calzado de Fútbol X 18.3 TF
    And seleccionar talla MX 9.5
    And Click añadir a carrito button
    And Verify cantidad "Cantidad: 1"
    And Click ver carrito link
    And Verify "CALZADO DE FÚTBOL X 18.3 TF" title is displayed
    And Price should be "$1,329.00"
    And Total should be "$1,428.00"