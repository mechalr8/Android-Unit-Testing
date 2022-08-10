package com.example.testinginandroid

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class RegistrationUtilTest  {

    @Test
    fun `empty username returns false`(){
        val result = RegistrationUtil.validRegistrationInput("", "12", "123")
        assertThat(result).isFalse()
    }

    @Test
    fun `username and correctly repeated password returns true`(){
        val result = RegistrationUtil.validRegistrationInput("Rahul", "123", "123")
        assertThat(result).isTrue()
    }

    @Test
    fun `username already taken returns false`(){
        val result = RegistrationUtil.validRegistrationInput("Rohan", "123", "123")
        assertThat(result).isFalse()
    }

    @Test
    fun `incorrect confirm password returns false`(){
        val result = RegistrationUtil.validRegistrationInput("Harsh", "123", "1234")
        assertThat(result).isFalse()
    }

    @Test
    fun `digit count of password is less than 2 returns false`(){
        val result = RegistrationUtil.validRegistrationInput("Roshan", "1", "1")
        assertThat(result).isFalse()
    }
}