package com.kotlin.bankAPI.datasource

import com.kotlin.bankAPI.model.Bank

interface BankDataSource {
    fun getBanks(): Collection<Bank>
}