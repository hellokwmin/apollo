package org.bbop.apollo.gwt.shared;

/**
 * Created by ndunn on 4/2/15.
 */
public enum FeatureStringEnum {
        ID,
        FEATURES,
        SUPPRESS_HISTORY,
        SUPPRESS_EVENTS,
        FEATURE_PROPERTY,
        ANNOTATION_COUNT,
        PARENT,
        PARENT_ID,
        PARENT_NAME,
        USERNAME,
        EDITOR,
        TYPE,
        PARENT_TYPE,
        PROPERTIES,
        TIMEACCESSION,
        DEFAULT,
        TIMELASTMODIFIED,
        RESIDUES,
        CHILDREN,
        CDS("CDS"),
        EXON("Exon"),
        GENE("Gene"),
        PSEUDOGENE("Pseudogene"),
        STOP_CODON_READTHROUGH("stop_codon_read_through"),
        STOP_CODON_READHTHROUGH_SUFFIX("-stop_codon_read_through"),
        READTHROUGH_STOP_CODON,
        TRANSCRIPT("Transcript"),
        NONCANONICALFIVEPRIMESPLICESITE("NonCanonicalFivePrimeSpliceSite"),
        NONCANONICALTHREEPRIMESPLICESITE("NonCanonicalThreePrimeSpliceSite"),
        DATE_LAST_MODIFIED,
        DATE_CREATION,
        DATE,
        CURRENT,
        CURRENT_TAB,
        COMMENT,
        OLD_COMMENTS,
        NEW_COMMENTS,
        TAG_VALUE_DELIMITER("="),
        COMMENTS,
        CANNED_COMMENTS,
        CANNED_KEYS,
        CANNED_VALUES,
        STATUS,
        AVAILABLE_STATUSES,
        NOTES,
        TAG,
        COMMON_DATA_DIRECTORY("common_data_directory"),
        BAD_COMMON_PATH("badCommonPath"),
        NON_RESERVED_PROPERTIES,
        OLD_NON_RESERVED_PROPERTIES,
        NEW_NON_RESERVED_PROPERTIES,
        LOCATION,
        COUNT,
        CONFIRM,
        FMIN,
        FMAX,
        IS_FMIN_PARTIAL,
        IS_FMAX_PARTIAL,
        STRAND,
        NAME,
        GENE_NAME,
        VALUE,
        REMOTE_USER("REMOTE_USER"),
        CV,
        SEQUENCE,
        SEQUENCE_DATA("sequenceData"),
        TRACK,
        DB,
        DBXREFS,
        CLIENT_TOKEN("clientToken"),
        IGNORE,
        PREFERENCE,
        ACCESSION,
        CDS_SUFFIX("-CDS"),
        MINUS1FRAMESHIFT("Minus1Frameshift"),
        MINUS2FRAMESHIFT("Minus2Frameshift"),
        PLUS1FRAMESHIFT("Plus1Frameshift"),
        PLUS2FRAMESHIFT("Plus2Frameshift"),
        DELETION_PREFIX("Deletion-"),
        INSERTION_PREFIX("Insertion-"),
        OWNER("owner"),
        ORGANISM,
        SYMBOL,
        ALTERNATECVTERM("alternateCvTerm"),
        DESCRIPTION,
        ANNOTATION_INFO_EDITOR_CONFIGS,
        HASDBXREFS("hasDbxrefs"),
        HASATTRIBUTES("hasAttributes"),
        HASPUBMEDIDS("hasPubmedIds"),
        HASGOIDS("hasGoIds"),
        HASCOMMENTS("hasComments"),
        SUPPORTED_TYPES,
        OLD_DBXREFS,
        NEW_DBXREFS,
        ATTRIBUTES,
        PUBMEDIDS("pubmed_ids"),
        GOIDS("go_ids"),
        SYNONYMS,
        HIGHLIGHTED_REGION("highlighted region"),
        UNIQUENAME,
        // TODO: move these to a SequenceTypeEnum
        TYPE_PEPTIDE("peptide"),
        TYPE_CDS("cds"),
        TYPE_CDNA("cdna"),
        TYPE_GENOMIC("genomic"),
        TYPE_FASTA("FASTA"),
        TYPE_GFF3("GFF3"),
        TYPE_VCF("VCF"),
        TYPE_CHADO("CHADO"),
        EXPORT_CHADO_CLEAN("chado_clean"),
        EXPORT_CHADO_UPDATE("chado_update"),
        EXPORT_ID("ID"),
        EXPORT_DBXREF("Dbxref"),
        EXPORT_NAME("Name"),
        EXPORT_ALIAS("Alias"),
        EXPORT_NOTE("Note"),
        EXPORT_PARENT("Parent"),
        ORGANISM_JBROWSE_DIRECTORY("organismJBrowseDirectory"),
        ORGANISM_ID("organismId"),
        ORGANISM_NAME("commonName"),
        ORGANISM_DATA("organismData"),
        SEQUENCE_NAME("sequenceName"),
        DEFAULT_SEQUENCE_NAME("defaultSequenceName"),
        PERMISSIONS,
        ERROR,
        ERROR_MESSAGE,
        REQUEST_INDEX,
        HAS_USERS,
        USER_ID("userId"),
        LOCKED,
        HISTORY,
        DOCK_OPEN("dockOpen"),
        DOCK_WIDTH("dockWidth"),
        USE_CDS,
        USE_NAME,
        TRACKS,
        LABEL,
        URL_TEMPLATE("urlTemplate"),
        TRACK_DATA("trackData"),
        TRACK_FILE("trackFile"),
        TRACK_FILE_INDEX("trackFileIndex"),
        TRACK_CONFIG("trackConfig"),
        TRACK_LABEL("trackLabel"),
        CREATOR("creator"),
        START,
        END,
        SCORE,
        NUMBER,
        FILTER,
        VALUES,
        META,
        BASES,
        REFERENCE_ALLELE,
        ALTERNATIVE_ALLELES,
        GENOTYPES,
        ALTERNATE_ALLELES,
        OLD_ALTERNATE_ALLELES,
        NEW_ALTERNATE_ALLELES,
        ALLELE_FREQUENCY("allele_frequency"),
        ALLELE_FREQUENCY_TAG("AF"),
        PROVENANCE,
        ALLELE,
        ALLELE_INFO,
        NEW_ALLELE_INFO,
        OLD_ALLELE_INFO,
        VARIANT_INFO,
        OLD_VARIANT_INFO,
        NEW_VARIANT_INFO,
        ORIG_ID,
        ;


        private String value;

        FeatureStringEnum(String value) {
            this.value = value;
        }

        FeatureStringEnum() {
            this.value = name().toLowerCase();
        }

        @Override
        public String toString() {
            return value;
        }

        public String getValue() {
                return value;
        }

}
