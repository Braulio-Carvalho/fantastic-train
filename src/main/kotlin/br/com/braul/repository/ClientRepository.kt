package br.com.braul.repository

import br.com.braul.entity.Client
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface ClientRepository : JpaRepository<Client, Int?>{

}