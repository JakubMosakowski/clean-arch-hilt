package com.mosjak

import org.gradle.api.plugins.ExtensionContainer

inline fun <reified T> ExtensionContainer.getByType(): T =
    getByType(T::class.java)
