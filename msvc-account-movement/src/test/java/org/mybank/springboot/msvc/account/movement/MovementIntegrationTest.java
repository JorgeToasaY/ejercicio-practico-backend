/*package org.mybank.springboot.msvc.account.movement;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Testcontainers
class MovementIntegrationTest {
    @Container
    static PostgreSQLContainer<?> pg = new PostgreSQLContainer<>("postgres:15")
            .withDatabaseName("testdb").withUsername("admin").withPassword("admin");

    @DynamicPropertySource
    static void props(DynamicPropertyRegistry r) {
        r.add("spring.datasource.url", pg::getJdbcUrl);
        r.add("spring.datasource.username", pg::getUsername);
        r.add("spring.datasource.password", pg::getPassword);
        r.add("spring.jpa.hibernate.ddl-auto", () -> "update");
    }

    @Autowired AccountRepository accountRepo;
    @Autowired MovementService movementService;

    @Test
    void debitShouldFailWhenNoFunds() {
        Account a = new Account();
        a.setNumeroCuenta("1001"); a.setTipoCuenta("AHORROS");
        a.setSaldoInicial(new BigDecimal("50")); a.setSaldoDisponible(new BigDecimal("50"));
        a.setEstado(true); a.setCustomerId("C-001");
        accountRepo.save(a);

        assertThrows(BusinessException.class, () ->
                movementService.registrarMovimiento("1001", new BigDecimal("-60"), "RETIRO"));
    }
}*/