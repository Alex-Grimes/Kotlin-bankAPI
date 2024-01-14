package com.kotlin.bankAPI.datasource.mock

import org.springframework.stereotype.Repository
import com.kotlin.bankAPI.model.Bank
import com.kotlin.bankAPI.datasource.BankDataSource

@Repository
class MockBankDataSource : BankDataSource {
     override  fun getbanks(): Collection<Bank> {
         TODO("not implemented")
     }
}