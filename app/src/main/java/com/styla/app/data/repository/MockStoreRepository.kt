package com.styla.app.data.repository

import com.styla.app.data.model.Category
import com.styla.app.data.model.DayOfWeek
import com.styla.app.data.model.PriceRange
import com.styla.app.data.model.Store

object MockStoreRepository {

    fun getAllStores(): List<Store> = stores

    fun getStoreById(id: String): Store? = stores.find { it.id == id }

    fun getStoresByCategory(category: Category): List<Store> =
        stores.filter { it.category == category }

    private val standardHours = mapOf(
        DayOfWeek.MONDAY to "10:00 AM - 7:00 PM",
        DayOfWeek.TUESDAY to "10:00 AM - 7:00 PM",
        DayOfWeek.WEDNESDAY to "10:00 AM - 7:00 PM",
        DayOfWeek.THURSDAY to "10:00 AM - 7:00 PM",
        DayOfWeek.FRIDAY to "10:00 AM - 7:00 PM",
        DayOfWeek.SATURDAY to "10:00 AM - 7:00 PM",
        DayOfWeek.SUNDAY to "Cerrado"
    )

    private val stores: List<Store> = listOf(
        Store(
            id = "store_001",
            name = "LaPercha",
            category = Category.DESIGNER,
            description = "Concept store curado de diseñadores independientes colombianos. " +
                    "Piezas únicas, cotidianas y con identidad. Rango de precios accesible " +
                    "para boutique de autor.",
            tagline = "Moda como identidad, no como ruido.",
            address = "Cl. 71 #10-47, Chapinero",
            neighborhood = "Chapinero",
            latitude = 4.6557028,
            longitude = -74.0587816,
            phone = "+57 300 5789091",
            instagram = "@lapercha.co",
            openingHours = standardHours,
            rating = 4.5,
            priceRange = PriceRange.MID
        ),
        Store(
            id = "store_002",
            name = "Discrepante",
            category = Category.DESIGNER,
            description = "Tienda multimarca con arte y artesanías colombianas de alta calidad. " +
                    "Cerámicas, joyería, ropa y accesorios de creadores locales. Sostenible y ética.",
            tagline = "Lo mejor del talento colombiano, en un solo lugar.",
            address = "Kr 13 #82-24, Zona Rosa",
            neighborhood = "Zona Rosa",
            latitude = 4.6670729,
            longitude = -74.0546007,
            phone = "+57 318 6477022",
            instagram = "@discrepante.co",
            openingHours = standardHours + (DayOfWeek.SUNDAY to "11:00 AM - 7:00 PM"),
            rating = 5.0,
            priceRange = PriceRange.MID
        ),
        Store(
            id = "store_003",
            name = "La Chaquetería Zona T",
            category = Category.LUXURY,
            description = "Especialistas en chaquetas y bolsos de cuero artesanal. " +
                    "Cada pieza es trabajada a mano con materiales premium. Opciones a la medida.",
            tagline = "El cuero, elevado a obra de autor.",
            address = "Cl. 84A #12a-04, Of. 301, Zona T",
            neighborhood = "Zona T",
            latitude = 4.6685593,
            longitude = -74.0536389,
            phone = "+57 350 5472233",
            instagram = "@lachaqueteria",
            openingHours = mapOf(
                DayOfWeek.MONDAY to "9:00 AM - 7:00 PM",
                DayOfWeek.TUESDAY to "9:00 AM - 7:00 PM",
                DayOfWeek.WEDNESDAY to "9:00 AM - 7:00 PM",
                DayOfWeek.THURSDAY to "9:00 AM - 7:00 PM",
                DayOfWeek.FRIDAY to "9:00 AM - 7:00 PM",
                DayOfWeek.SATURDAY to "9:00 AM - 7:00 PM",
                DayOfWeek.SUNDAY to "10:00 AM - 6:00 PM"
            ),
            rating = 4.7,
            priceRange = PriceRange.PREMIUM
        ),
        Store(
            id = "store_004",
            name = "St.Dom",
            category = Category.DESIGNER,
            description = "Boutique referente de diseñadores colombianos independientes. " +
                    "Piezas one-of-a-kind, joyería statement y prendas que no se consiguen " +
                    "fuera de Colombia.",
            tagline = "Tu próxima obsesión, hecha en Colombia.",
            address = "Cl. 79b #8-40, Zona Rosa",
            neighborhood = "Zona Rosa",
            latitude = 4.6625879,
            longitude = -74.0518672,
            phone = "+57 317 6354353",
            instagram = "@stdom_bogota",
            openingHours = standardHours.mapValues { "10:00 AM - 8:00 PM" } +
                    (DayOfWeek.SUNDAY to "10:00 AM - 5:00 PM"),
            rating = 4.4,
            priceRange = PriceRange.PREMIUM
        ),
        Store(
            id = "store_005",
            name = "Amorella",
            category = Category.DESIGNER,
            description = "Tienda multimarca con las mejores marcas colombianas. " +
                    "Variedad de estilos, atención personalizada y curaduría que apoya " +
                    "la industria nacional.",
            tagline = "Apoya lo local, vístete con intención.",
            address = "Cl. 93b #16-47, Chapinero",
            neighborhood = "Chapinero",
            latitude = 4.6790659,
            longitude = -74.0523652,
            phone = "+57 318 6826605",
            instagram = "@amorella.co",
            openingHours = standardHours + (DayOfWeek.SUNDAY to "11:30 AM - 6:00 PM"),
            rating = 4.4,
            priceRange = PriceRange.MID
        ),
        Store(
            id = "store_006",
            name = "Macalet Boutique",
            category = Category.DESIGNER,
            description = "Boutique femenina con curaduría de marcas tendencia. " +
                    "Precios accesibles y servicio impecable a un paso de Andino y El Retiro.",
            tagline = "Trendy sin compromiso.",
            address = "Kr 13 #78-47, Chapinero",
            neighborhood = "Chapinero",
            latitude = 4.6644766,
            longitude = -74.0564843,
            phone = "+57 300 4163222",
            instagram = "@macaletboutique",
            openingHours = standardHours.mapValues { "11:00 AM - 7:00 PM" } +
                    (DayOfWeek.SUNDAY to "11:00 AM - 6:30 PM"),
            rating = 5.0,
            priceRange = PriceRange.MID
        ),
        Store(
            id = "store_007",
            name = "Mira Smith",
            category = Category.DESIGNER,
            description = "Vestuario y accesorios para mujer con colores vibrantes y diseños " +
                    "originales. Versátil entre lo elegante y lo divertido.",
            tagline = "Color, carácter y confianza.",
            address = "Cl. 109 #17-12, Usaquén",
            neighborhood = "Usaquén",
            latitude = 4.6939379,
            longitude = -74.0473485,
            phone = "+57 601 6195564",
            instagram = "@mirasmith.co",
            openingHours = standardHours,
            rating = 4.3,
            priceRange = PriceRange.MID
        ),
        Store(
            id = "store_008",
            name = "YC Boutique",
            category = Category.DESIGNER,
            description = "Boutique con asesoría personalizada según tu tipo de cuerpo. " +
                    "Espacio renovado, ambiente acogedor y curaduría enfocada en versatilidad.",
            tagline = "Vestirte mejor empieza con buena asesoría.",
            address = "Cl. 156 #7-16, Usaquén",
            neighborhood = "Usaquén",
            latitude = 4.7316984,
            longitude = -74.0242947,
            phone = "+57 302 3892148",
            instagram = "@ycboutique",
            openingHours = standardHours,
            rating = 4.1,
            priceRange = PriceRange.MID
        ),
        Store(
            id = "store_009",
            name = "HYPE",
            category = Category.STREETWEAR,
            description = "El templo del streetwear y los sneakers en Bogotá. " +
                    "Marcas internacionales, drops exclusivos y la mejor selección de " +
                    "tenis del país.",
            tagline = "Si eres hypebeast, este es tu lugar.",
            address = "Cra. 14A #82-26, Chapinero",
            neighborhood = "Zona T",
            latitude = 4.6677865,
            longitude = -74.0556667,
            phone = "+57 601 5632422",
            instagram = "@hype.co",
            tiktok = "@hypecolombia",
            openingHours = standardHours.mapValues { "10:00 AM - 8:00 PM" } +
                    mapOf(
                        DayOfWeek.THURSDAY to "10:00 AM - 9:00 PM",
                        DayOfWeek.FRIDAY to "10:00 AM - 9:00 PM",
                        DayOfWeek.SATURDAY to "10:00 AM - 9:00 PM",
                        DayOfWeek.SUNDAY to "11:00 AM - 7:00 PM"
                    ),
            rating = 4.5,
            priceRange = PriceRange.PREMIUM
        ),
        Store(
            id = "store_010",
            name = "Fase 24",
            category = Category.STREETWEAR,
            description = "Streetwear y moda urbana con diseños originales y servicio cercano. " +
                    "Pieza por pieza, cada prenda tiene un toque que la hace única.",
            tagline = "Streetwear con alma de barrio.",
            address = "Cl. 24 #9-41, Centro Internacional",
            neighborhood = "Centro Internacional",
            latitude = 4.6105384,
            longitude = -74.0712848,
            phone = "+57 321 4868754",
            instagram = "@fase24.co",
            openingHours = mapOf(
                DayOfWeek.MONDAY to "9:00 AM - 5:00 PM",
                DayOfWeek.TUESDAY to "9:00 AM - 5:00 PM",
                DayOfWeek.WEDNESDAY to "9:00 AM - 5:00 PM",
                DayOfWeek.THURSDAY to "9:00 AM - 5:00 PM",
                DayOfWeek.FRIDAY to "9:00 AM - 5:00 PM",
                DayOfWeek.SATURDAY to "9:00 AM - 5:00 PM",
                DayOfWeek.SUNDAY to "Cerrado"
            ),
            rating = 5.0,
            priceRange = PriceRange.MID
        ),
        Store(
            id = "store_011",
            name = "DROP Concept Store",
            category = Category.STREETWEAR,
            description = "Tienda exclusiva con los mejores drops de streetwear internacional. " +
                    "Sneakers de edición limitada, envíos internacionales y curaduría premium.",
            tagline = "Los drops que importan, antes que el resto.",
            address = "Cl. 93b #13-50, Chicó",
            neighborhood = "Chicó",
            latitude = 4.6780533,
            longitude = -74.0495425,
            phone = "+57 310 5638682",
            instagram = "@dropconceptstore",
            openingHours = standardHours + (DayOfWeek.SUNDAY to "11:00 AM - 6:00 PM"),
            rating = 4.8,
            priceRange = PriceRange.PREMIUM
        ),
        Store(
            id = "store_012",
            name = "571 / CincoSieteUno",
            category = Category.STREETWEAR,
            description = "Marca bogotana de streetwear desde 2011. Accesorios exóticos, " +
                    "diseños que no se ven en otro lado, intersección entre moda y arte urbano.",
            tagline = "Bogotá, codificada en cada pieza.",
            address = "Cra. 40 #24A-65, Quinta Paredes",
            neighborhood = "Quinta Paredes",
            latitude = 4.6317358,
            longitude = -74.0917953,
            phone = "+57 315 8857743",
            instagram = "@571_dc",
            openingHours = mapOf(
                DayOfWeek.MONDAY to "8:00 AM - 6:00 PM",
                DayOfWeek.TUESDAY to "8:00 AM - 6:00 PM",
                DayOfWeek.WEDNESDAY to "8:00 AM - 6:00 PM",
                DayOfWeek.THURSDAY to "8:00 AM - 6:00 PM",
                DayOfWeek.FRIDAY to "8:00 AM - 6:00 PM",
                DayOfWeek.SATURDAY to "9:00 AM - 2:00 PM",
                DayOfWeek.SUNDAY to "Cerrado"
            ),
            rating = 4.4,
            priceRange = PriceRange.MID
        ),
        Store(
            id = "store_013",
            name = "Planeta Vintage",
            category = Category.VINTAGE,
            description = "Vintage de segunda mano de calidad, con ambiente relajado y precios " +
                    "realistas. Espacio amplio para explorar sin presión.",
            tagline = "Que tu próxima joya sea una historia.",
            address = "Cra. 13a #34-57, Teusaquillo",
            neighborhood = "Teusaquillo",
            latitude = 4.6232194,
            longitude = -74.0687999,
            phone = "+57 323 8390932",
            instagram = "@planetavintage",
            openingHours = standardHours.mapValues { "11:00 AM - 7:00 PM" },
            rating = 4.8,
            priceRange = PriceRange.BUDGET
        ),
        Store(
            id = "store_014",
            name = "Mercado Negro",
            category = Category.VINTAGE,
            description = "Vintage internacional cuidadosamente curado, junto a un café cozy. " +
                    "Atmósfera bohemia, joyería seleccionada y un must para amantes del thrift.",
            tagline = "Bushwick vibes, alma bogotana.",
            address = "Dg. 68 #11A-29, Chapinero",
            neighborhood = "Chapinero",
            latitude = 4.6542091,
            longitude = -74.0615787,
            phone = "+57 301 6948391",
            instagram = "@mercadonegro.vintage",
            openingHours = mapOf(
                DayOfWeek.MONDAY to "Cerrado",
                DayOfWeek.TUESDAY to "10:00 AM - 7:00 PM",
                DayOfWeek.WEDNESDAY to "10:00 AM - 7:00 PM",
                DayOfWeek.THURSDAY to "10:00 AM - 7:00 PM",
                DayOfWeek.FRIDAY to "10:00 AM - 7:00 PM",
                DayOfWeek.SATURDAY to "10:00 AM - 7:00 PM",
                DayOfWeek.SUNDAY to "11:00 AM - 4:00 PM"
            ),
            rating = 4.8,
            priceRange = PriceRange.MID
        ),
        Store(
            id = "store_015",
            name = "Cultura Vintage",
            category = Category.VINTAGE,
            description = "Concepto único de segunda mano en La Candelaria. Calidad excepcional " +
                    "que no luce usada, joyería en oro y precios accesibles.",
            tagline = "Lo vintage también puede ser nuevo.",
            address = "Cra. 3 #12b-35, La Candelaria",
            neighborhood = "La Candelaria",
            latitude = 4.5980506,
            longitude = -74.0706225,
            phone = "+57 302 8330783",
            instagram = "@culturavintage.bogota",
            openingHours = mapOf(
                DayOfWeek.MONDAY to "Cerrado",
                DayOfWeek.TUESDAY to "12:00 PM - 7:30 PM",
                DayOfWeek.WEDNESDAY to "12:00 PM - 7:30 PM",
                DayOfWeek.THURSDAY to "12:00 PM - 7:30 PM",
                DayOfWeek.FRIDAY to "12:00 PM - 7:30 PM",
                DayOfWeek.SATURDAY to "12:00 PM - 7:30 PM",
                DayOfWeek.SUNDAY to "11:00 AM - 6:30 PM"
            ),
            rating = 5.0,
            priceRange = PriceRange.BUDGET
        ),
        Store(
            id = "store_016",
            name = "Revoltosas",
            category = Category.VINTAGE,
            description = "Proyecto vintage hecho por mujeres víctimas del conflicto armado. " +
                    "Cada prenda tiene historia, propósito y un precio accesible.",
            tagline = "Moda que viste, moda que sana.",
            address = "Cra. 20 #35-45, Teusaquillo",
            neighborhood = "Teusaquillo",
            latitude = 4.6251208,
            longitude = -74.0743288,
            instagram = "@revoltosas.vintage",
            openingHours = mapOf(
                DayOfWeek.MONDAY to "10:00 AM - 7:00 PM",
                DayOfWeek.TUESDAY to "10:00 AM - 7:00 PM",
                DayOfWeek.WEDNESDAY to "10:00 AM - 7:00 PM",
                DayOfWeek.THURSDAY to "10:00 AM - 7:00 PM",
                DayOfWeek.FRIDAY to "10:00 AM - 7:00 PM",
                DayOfWeek.SATURDAY to "10:00 AM - 5:00 PM",
                DayOfWeek.SUNDAY to "Cerrado"
            ),
            rating = 4.4,
            priceRange = PriceRange.BUDGET
        ),
        Store(
            id = "store_017",
            name = "Petunia",
            category = Category.ACCESSORIES,
            description = "Boutique para mujer joven con gran variedad de estilos, telas y " +
                    "accesorios. Abierto domingos y festivos, precios razonables.",
            tagline = "Tu nuevo go-to en accesorios.",
            address = "Ak 15 #108-11, Usaquén",
            neighborhood = "Usaquén",
            latitude = 4.692176,
            longitude = -74.045274,
            phone = "+57 310 5878248",
            instagram = "@petunia.co",
            openingHours = standardHours.mapValues { "10:00 AM - 7:30 PM" } +
                    (DayOfWeek.SUNDAY to "10:00 AM - 6:00 PM"),
            rating = 4.3,
            priceRange = PriceRange.MID
        ),
        Store(
            id = "store_018",
            name = "Yass Moda y Estilo",
            category = Category.DESIGNER,
            description = "Tienda de moda con buenas promociones, asesoría amable y opciones " +
                    "para todos los días. Buen punto de partida en Chapinero.",
            tagline = "Drop in, dress up, ¡repite!",
            address = "Kr 13 #55-24, Chapinero",
            neighborhood = "Chapinero",
            latitude = 4.6425365,
            longitude = -74.0645919,
            phone = "+57 312 4665951",
            instagram = "@yass.modayestilo",
            openingHours = standardHours.mapValues { "10:00 AM - 7:30 PM" } +
                    (DayOfWeek.SUNDAY to "10:00 AM - 7:30 PM"),
            rating = 4.5,
            priceRange = PriceRange.BUDGET
        )
    )
}