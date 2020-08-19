package com.sibelyildiz.jsonsample.data


/**     Code with ❤
╔════════════════════════════╗
║  Created by Sibel YILDIZ   ║
╠════════════════════════════╣
║ sibelyldz2012@gmail.com    ║
╠════════════════════════════╣
║     12/08/2020 - 18:43     ║
╚════════════════════════════╝
 */

data class RepoModel(
    val id: Long,
    val node_id: String,
    val name: String,
    val full_name: String,
    val private: Boolean,
    val owner: OwnerModel,
    val html_url: String,
    val description: String,
    val fork: Boolean,
    val url: String,
    val forks_url: String,
    val keys_url: String,
    val collaborators_url: String,
    val teams_url: String,
    val hooks_url: String,
    val issue_events_url: String,
    val events_url: String,
    val assignees_url: String,
    val branches_url: String,
    val license: LicenseModel,
    val forks: Int
)