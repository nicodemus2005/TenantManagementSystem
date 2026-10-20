# Tenant Management System — Lab 6

This is a complete Android Studio project scaffold for the Lab 6 app navigation / fragments practical.

## Open the project
1. Extract `TenantManagementSystem_Lab6.zip`.
2. Open Android Studio.
3. Choose **Open** and select the extracted `TenantManagementSystem` folder (the folder containing `settings.gradle.kts`).
4. Allow Gradle sync to finish. Internet access may be required to download Gradle and Android dependencies.
5. Create or start an Android emulator, then press **Run**.

## What is included
- Login and Register demo screens
- MainActivity with lifecycle logging (`TENANT_LIFECYCLE`)
- Tenant data class (`Serializable`)
- In-memory TenantRepository
- Dashboard, Add Tenant and View Tenants Fragments
- Navigation graph and Safe Args setup
- View Binding and Data Binding layouts

## Notes
- Login and registration are UI demonstrations only; there is no real authentication or account database.
- Tenant records are kept in memory and are lost when the app process is terminated.
- Use JDK 17 in Android Studio.
- If Android Studio asks for a Gradle wrapper or plugin update, accept a compatible suggested version.
- This is a standalone scaffold based on the lab's described screens. If your lecturer expects the existing Lab 5 project to be continued, compare its package name and Gradle versions before replacing files.
