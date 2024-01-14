package com.kotlin.bankAPI.service

import com.kotlin.bankAPI.datasource.BankDataSource
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class BankServiceTest {

    private val dataSource: BankDataSource = mock()

    private val bankService = BankService(dataSource)

    @Test
    fun `should call its data source to retrieve banks`() {

        val banks = bankService.getBanks()
    }
}