// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.custom_scalar_type_warnings.type

import com.apollographql.apollo.api.ScalarType
import java.lang.Class
import kotlin.String

enum class CustomType : ScalarType {
    URL {
        override fun typeName(): String = "URL"

        override fun javaType(): Class<*> = java.lang.Object::class.java
    },

    ID {
        override fun typeName(): String = "ID"

        override fun javaType(): Class<*> = kotlin.String::class.java
    }
}