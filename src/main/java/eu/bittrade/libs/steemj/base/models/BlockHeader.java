package eu.bittrade.libs.steemj.base.models;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import eu.bittrade.libs.steemj.util.SteemJUtils;

/**
 * @author <a href="http://steemit.com/@dez1337">dez1337</a>
 */
public class BlockHeader {
    // Original type is "block_id_type" which wraps a ripemd160 hash. We use an
    // byte array to cover this type.
    protected byte[] previous;
    protected long timestamp;
    protected String witness;
    // Original type is "checksum_type" which wraps a ripemd160 hash. We use an
    // byte array to cover this type.
    @JsonProperty("transaction_merkle_root")
    protected byte[] transactionMerkleRoot;
    // Original type is "block_header_extensions_type" which is an array of
    // "block_header_extensions".
    protected List<BlockHeaderExtensions> extensions;

    /**
     * @return the previous
     */
    public byte[] getPrevious() {
        return previous;
    }

    /**
     * @param previous
     *            the previous to set
     */
    public void setPrevious(byte[] previous) {
        this.previous = previous;
    }

    /**
     * @return the timestamp
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * @param timestamp
     *            the timestamp to set
     */
    @JsonIgnore
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Additional setter to also handle dates provided as String. The date has
     * to be specified as String and needs a special format:
     * yyyy-MM-dd'T'HH:mm:ss
     * 
     * <p>
     * Example: "2016-08-08T12:24:17"
     * </p>
     * 
     * @param timestamp
     *            The creation date of this block in its String representation.
     * @throws ParseException
     *             If the given String does not patch the pattern.
     */
    public void setTimestamp(String timestamp) throws ParseException {
        this.timestamp = SteemJUtils.transformStringToTimestamp(timestamp);
    }

    /**
     * @return the witness
     */
    public String getWitness() {
        return witness;
    }

    /**
     * @param witness
     *            the witness to set
     */
    public void setWitness(String witness) {
        this.witness = witness;
    }

    /**
     * @return the transactionMerkleRoot
     */
    public byte[] getTransactionMerkleRoot() {
        return transactionMerkleRoot;
    }

    /**
     * @param transactionMerkleRoot
     *            the transactionMerkleRoot to set
     */
    public void setTransactionMerkleRoot(byte[] transactionMerkleRoot) {
        this.transactionMerkleRoot = transactionMerkleRoot;
    }

    /**
     * Get the list of configured extensions.
     * 
     * @return All extensions.
     */
    public List<BlockHeaderExtensions> getExtensions() {
        if (extensions == null || extensions.isEmpty()) {
            // Create a new ArrayList that contains an empty FutureExtension so
            // one byte gets added to the signature for sure.
            extensions = new ArrayList<>();
            extensions.add(new BlockHeaderExtensions());
        }
        return extensions;
    }

    /**
     * Extensions are currently not supported and will be ignored.
     * 
     * @param extensions
     *            Define a list of extensions.
     */
    public void setExtensions(List<BlockHeaderExtensions> extensions) {
        this.extensions = extensions;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}