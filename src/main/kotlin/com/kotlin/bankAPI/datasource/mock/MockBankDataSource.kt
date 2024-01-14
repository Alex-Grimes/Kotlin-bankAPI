package com.kotlin.bankAPI.datasource.mock

import org.springframework.stereotype.Repository
import com.kotlin.bankAPI.model.Bank
import com.kotlin.bankAPI.datasource.BankDataSource

@Repository
class MockBankDataSource : BankDataSource {
    val banks = listOf(
        Bank(accountNumber = "1234", trust = 1.2, transactionFee = 1),
        Bank(accountNumber = "1235", trust = 1.2, transactionFee = 1),
        Bank(accountNumber = "1237", trust = 1.2, transactionFee = 2)
    )
     override fun getBanks(): Collection<Bank> = banks
}