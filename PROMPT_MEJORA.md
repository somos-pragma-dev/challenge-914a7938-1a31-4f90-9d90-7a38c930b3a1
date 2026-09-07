# Prompt para Mejorar el Codigo Base

Copia y pega el siguiente contenido completo en un asistente de IA (Claude, ChatGPT, etc.)
para obtener un ZIP con el proyecto arrancable. Si el adjunto es una carcasa (docs/placeholders),
el asistente debe materializar la estructura del stack del briefing, sin resolver las fases del reto.

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Contexto técnico original
Crear un microservicio REST con Spring Boot, JPA y H2

### Reto
- Tema: java spring boot
- Seniority: junior-l1
- Tipo: practical
- Título: Desarrollo de un Microservicio REST
- Tiempo estimado: 8 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Configuración Inicial — objetivo: Tener un microservicio básico que pueda crear, leer, actualizar y eliminar productos. — entregable (NO resolver): Microservicio REST básico con las funcionalidades de CRUD para productos.
- Fase 2: Validaciones y Errores — objetivo: Mejorar el microservicio para manejar correctamente las validaciones y los errores. — entregable (NO resolver): Microservicio REST con manejo mejorado de validaciones y errores.
- Fase 3: Optimización y Refactorización — objetivo: Optimizar y refactorizar el microservicio para mejorar su rendimiento y mantenibilidad. — entregable (NO resolver): Microservicio REST optimizado y refactorizado.

Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 0 — ¿Esto es un proyecto o una carcasa?
Antes de extraer archivos, leé el Briefing (si está) y diagnosticá el adjunto.

Es CARCASA si ocurre CUALQUIERA de estas:
- No hay manifiesto de dependencias del stack del briefing (manifest.json de VTEX IO / package.json / pom.xml / build.gradle / requirements.txt / go.mod / *.tf / *.csproj, según corresponda)
- Hay un "binario" que en realidad es un comentario ("no puede ser mostrado como texto plano", placeholder .fig/.docx vacío)
- Los markdowns ya completan entregables de fases posteriores ("se implementó fade-in", lista de áreas ya resuelta)

Si es CARCASA:
- MATERIALIZÁ un proyecto que arranca en el stack del briefing (VTEX IO Store Framework, Angular, Terraform, pytest, Nest, etc.). Incluí manifiesto, punto de entrada y capa de interfaz reales.
- NO copies los markdowns de "solución" como si fueran el producto. Son ruido de generación.
- NO resuelvas las fases del briefing (están marcadas PROHIBIDO). Dejá el hueco pedagógico: el flujo existe, las microinteracciones/calidad/infra que el reto pide NO están hechas.
- Después seguí al PASO 5 (ZIP).

Si es un proyecto REAL (manifiesto + código que compila o arranca):
- Seguí PASO 1 en adelante. 🔴 compilación sí. 🟡 pedagógico no.

PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Exportación en ZIP
Empaqueta todos los archivos en un único archivo ZIP descargable respetando exactamente
la estructura de rutas indicada por los marcadores.
El ZIP debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: El ZIP debe estar listo para descargar al finalizar. No preguntes si el usuario
quiere generarlo. Simplemente genera el archivo y proporciona el enlace de descarga; No debes desplegar en el chat el resumen de lo que arreglaste al Zip, solo entregalo.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación, placeholders o binarios fake, NO la reproduzcas:
aplicá PASO 0 (materializar el proyecto del briefing). Reproducir la carcasa es un fallo.
No agregues texto después del enlace de descarga del ZIP
No preguntes si el usuario quiere el ZIP: simplemente generalo siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:
// === ARCHIVO: pom.xml ===
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.pragma</groupId>
    <artifactId>productservice</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>Product Service</name>
    <description>Product Service</description>
    <properties>
        <java.version>21</java.version>
        <spring.boot.version>3.4.0</spring.boot.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
            <version>${spring.boot.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
            <version>${spring.boot.version}</version>
        </dependency>
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <version>2.1.214</version>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <version>${spring.boot.version}</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <version>${spring.boot.version}</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>repackage</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
</project>

// === ARCHIVO: src/main/java/com/pragma/productservice/application/ProductService.java ===
package com.pragma.productservice.application;

import com.pragma.productservice.domain.Product;
import com.pragma.productservice.infrastructure.ProductDTO;

public interface ProductService {
    ProductDTO createProduct(ProductDTO productDTO);
    ProductDTO getProductById(Long id);
    ProductDTO updateProduct(Long id, ProductDTO productDTO);
    void deleteProduct(Long id);
}

// === ARCHIVO: src/main/java/com/pragma/productservice/application/ProductServiceImpl.java ===
package com.pragma.productservice.application;

import com.pragma.productservice.domain.Product;
import com.pragma.productservice.infrastructure.ProductDTO;
import com.pragma.productservice.infrastructure.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        if (productDTO.getPrice() < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        if (productRepository.existsByName(productDTO.getName())) {
            throw new IllegalArgumentException("El nombre del producto ya existe");
        }
        Product product = new Product(productDTO.getName(), productDTO.getPrice(), productDTO.getStock(), productDTO.getCategory());
        productRepository.save(product);
        return new ProductDTO(product);
    }

    @Override
    public ProductDTO getProductById(Long id) {
        return productRepository.findById(id)
               .map(ProductDTO::new)
               .orElseThrow(() -> new IllegalArgumentException("Producto no encontrado"));
    }

    @Override
    public ProductDTO updateProduct(Long id, ProductDTO productDTO) {
        if (productDTO.getPrice() < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        if (productRepository.existsByNameAndIdNot(productDTO.getName(), id)) {
            throw new IllegalArgumentException("El nombre del producto ya existe");
        }
        Product product = productRepository.findById(id)
               .orElseThrow(() -> new IllegalArgumentException("Producto no encontrado"));
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setStock(productDTO.getStock());
        product.setCategory(productDTO.getCategory());
        productRepository.save(product);
        return new ProductDTO(product);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}

// === ARCHIVO: src/main/java/com/pragma/productservice/domain/Product.java ===
package com.pragma.productservice.domain;

import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private int stock;
    private String category;

    public Product() {}

    public Product(String name, double price, int stock, String category) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

// === ARCHIVO: src/main/java/com/pragma/productservice/infrastructure/ProductRepository.java ===
package com.pragma.productservice.infrastructure;

import com.pragma.productservice.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByName(String name);
    boolean existsByName(String name);
    boolean existsByNameAndIdNot(String name, Long id);
}

// === ARCHIVO: src/main/java/com/pragma/productservice/infrastructure/ProductRepositoryImpl.java ===
package com.pragma.productservice.infrastructure;

import com.pragma.productservice.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @Override
    public Optional<Product> findByName(String name) {
        // Implementación del método
        return Optional.empty();
    }

    @Override
    public boolean existsByName(String name) {
        // Implementación del método
        return false;
    }

    @Override
    public boolean existsByNameAndIdNot(String name, Long id) {
        // Implementación del método
        return false;
    }
}

// === ARCHIVO: src/main/java/com/pragma/productservice/infrastructure/ProductController.java ===
package com.pragma.productservice.infrastructure;

import com.pragma.productservice.application.ProductService;
import com.pragma.productservice.infrastructure.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO productDTO) {
        return ResponseEntity.ok(productService.createProduct(productDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable Long id) {
        return ResponseEntity.ok(productService.getProductById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductDTO> updateProduct(@PathVariable Long id, @RequestBody ProductDTO productDTO) {
        return ResponseEntity.ok(productService.updateProduct(id, productDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return ResponseEntity.ok().build();
    }
}

// === ARCHIVO: src/main/resources/application.properties ===
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true

// === ARCHIVO: src/main/resources/data.sql ===
CREATE TABLE products (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price DOUBLE NOT NULL,
    stock INT NOT NULL,
    category VARCHAR(255) NOT NULL
);

// === ARCHIVO: src/test/java/com/pragma/productservice/application/ProductServiceTest.java ===
package com.pragma.productservice.application;

import com.pragma.productservice.domain.Product;
import com.pragma.productservice.infrastructure.ProductDTO;
import com.pragma.productservice.infrastructure.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProductServiceImplTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductServiceImpl productService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void createProduct_success() {
        ProductDTO productDTO = new ProductDTO("Product 1", 10.0, 100, "Category 1");
        when(productRepository.save(any(Product.class))).thenReturn(new Product(productDTO.getName(), productDTO.getPrice(), productDTO.getStock(), productDTO.getCategory()));
        ProductDTO result = productService.createProduct(productDTO);
        assertNotNull(result);
        assertEquals(productDTO.getName(), result.getName());
    }

    @Test
    void createProduct_negativePrice_throwsException() {
        ProductDTO productDTO = new ProductDTO("Product 1", -10.0, 100, "Category 1");
        assertThrows(IllegalArgumentException.class, () -> productService.createProduct(productDTO));
    }

    @Test
    void getProductById_success() {
        Long id = 1L;
        Product product = new Product("Product 1", 10.0, 100, "Category 1");
        when(productRepository.findById(id)).thenReturn(Optional.of(product));
        ProductDTO result = productService.getProductById(id);
        assertNotNull(result);
        assertEquals(product.getName(), result.getName());
    }

    @Test
    void getProductById_notFound_throwsException() {
        Long id = 1L;
        when(productRepository.findById(id)).thenReturn(Optional.empty());
        assertThrows(IllegalArgumentException.class, () -> productService.getProductById(id));
    }

    @Test
    void updateProduct_success() {
        Long id = 1L;
        ProductDTO productDTO = new ProductDTO("Product 1", 10.0, 100, "Category 1");
        Product product = new Product(productDTO.getName(), productDTO.getPrice(), productDTO.getStock(), productDTO.getCategory());
        when(productRepository.findById(id)).thenReturn(Optional.of(product));
        when(productRepository.save(any(Product.class))).thenReturn(product);
        ProductDTO result = productService.updateProduct(id, productDTO);
        assertNotNull(result);
        assertEquals(productDTO.getName(), result.getName());
    }

    @Test
    void updateProduct_negativePrice_throwsException() {
        Long id = 1L;
        ProductDTO productDTO = new ProductDTO("Product 1", -10.0, 100, "Category 1");
        assertThrows(IllegalArgumentException.class, () -> productService.updateProduct(id, productDTO));
    }

    @Test
    void deleteProduct_success() {
        Long id = 1L;
        doNothing().when(productRepository).deleteById(id);
        productService.deleteProduct(id);
        verify(productRepository, times(1)).deleteById(id);
    }
}

// === ARCHIVO: src/test/java/com/pragma/productservice/infrastructure/ProductControllerTest.java ===
package com.pragma.productservice.infrastructure;

import com.pragma.productservice.application.ProductService;
import com.pragma.productservice.infrastructure.ProductDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProductControllerTest {

    @Mock
    private ProductService productService;

    @InjectMocks
    private ProductController productController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void createProduct_success() {
        ProductDTO productDTO = new ProductDTO("Product 1", 10.0, 100, "Category 1");
        when(productService.createProduct(productDTO)).thenReturn(productDTO);
        ResponseEntity<ProductDTO> response = productController.createProduct(productDTO);
        assertEquals(200, response.getStatusCodeValue());
        assertEquals(productDTO, response.getBody());
    }

    @Test
    void getProductById_success() {
        Long id = 1L;
        ProductDTO productDTO = new ProductDTO("Product 1", 10.0, 100, "Category 1");
        when(productService.getProductById(id)).thenReturn(productDTO);
        ResponseEntity<ProductDTO> response = productController.getProductById(id);
        assertEquals(200, response.getStatusCodeValue());
        assertEquals(productDTO, response.getBody());
    }

    @Test
    void updateProduct_success() {
        Long id = 1L;
        ProductDTO productDTO = new ProductDTO("Product 1", 10.0, 100, "Category 1");
        when(productService.updateProduct(id, productDTO)).thenReturn(productDTO);
        ResponseEntity<ProductDTO> response = productController.updateProduct(id, productDTO);
        assertEquals(200, response.getStatusCodeValue());
        assertEquals(productDTO, response.getBody());
    }

    @Test
    void deleteProduct_success() {
        Long id = 1L;
        doNothing().when(productService).deleteProduct(id);
        ResponseEntity<Void> response = productController.deleteProduct(id);
        assertEquals(200, response.getStatusCodeValue());
    }
}

```
