package com.kotlin.bankAPI.datasource.mock

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat

import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {

    private val mockBankDataSource = MockBankDataSource()

    @Test
    fun `should provide a collection of banks`() {

        val banks = mockBankDataSource.getBanks()

        assertThat(banks).isNotEmpty
    }

    @Test
    fun `should provide some mock data`() {
        val banks = mockBankDataSource.getBanks()

        assertThat(banks).allMatch() { it.accountNumber.isNotBlank()}
        assertThat(banks).anyMatch() { it.trust != 0.0}
        assertThat(banks).anyMatch() { it.transactionFee != 0}
    }

}