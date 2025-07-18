# 🔐 SecurePassGen

**SecurePassGen** è un microservizio Java/Spring per la generazione di password sicure, ad alta entropia e personalizzabili secondo policy definite dall'utente.

> ⚠️ Attualmente in fase di sviluppo attivo.  
> Questo progetto è parte di uno studio personale avanzato su sicurezza, clean code e architettura.

---

## 🚀 Tecnologie usate

- Java 21
- Spring Boot 3
- Maven
- JUnit 5
- SpringDoc / Swagger
- PostgreSQL (in futuro)
- Docker (in futuro)

---

## 🎯 Obiettivi del progetto

- Generazione password sicure con criteri personalizzati
- Calcolo entropia password
- Architettura modulare e testabile
- Estensione futura a password manager con vault cifrati e login JWT

---

## 📌 Roadmap

### v1.0 – Password Generator
- [ ] Policy di generazione
- [ ] Entropia calcolata
- [ ] API REST `/generate`
- [ ] Test unitari
- [ ] Docker ready

### v2.0 – Password Manager (vault cifrato)
- [ ] Gestione utenti
- [ ] AES Encryption
- [ ] Autenticazione base

### v3.0 – Sicurezza avanzata
- [ ] JWT
- [ ] Rate limiting
- [ ] UI/Frontend

---

## 👤 Autore

**Adriano Incognito**  
🌐 [GitHub](https://github.com/Adriano995)  
💡 Appassionato di Java, sicurezza e sviluppo full stack

---

## 🧪 Note tecniche

Questo progetto segue una filosofia didattica e professionale:
- Separazione dei livelli (DTO, Service, Controller)
- Coverage test prioritario
- Codice auto-documentato
- Flessibilità per futuri refactor

