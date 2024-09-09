create table if not exists accumulated_releases(
accumulated_release_indicator Integer not null,
target_itam_name varchar(255) null,
target_itam_type varchar(255) null,
target_itam_owner varchar(255) null,
tech_contact varchar(255) null,
target_itam_PO varchar(255) null,
deployment_indicator bigint null,
target_itam_ba varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint accumulated_releases_pk primary key(accumulated_release_indicator));